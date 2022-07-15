import {useParams} from "react-router-dom";
import {useEffect} from "react";
import {useState} from "react";


function Detail() {
  const {id} = useParams();
  const [movie, setMovie] = useState([]);

  const getMovie = async() => {
    const json = await (
      await fetch(
        `https://yts.mx/api/v2/movie_details.json?movie_id=${id}`)
    ).json();
    setMovie(json.data.movie);
  };

  useEffect(() => {
    getMovie();
  }, []);

  return (
    <div>
      <h1>Detail</h1>
      <div>
        <div>
          <img src={movie.medium_cover_image} alt={movie.title_long} />
          <h2>
            {movie.title_long}
          </h2>
          <p>{movie.description_full}</p>
          <ul>
            {movie.genres && movie.genres.map((genre) => (
              <li key={genre}>{genre}</li>
            ))}
          </ul>
        </div>
      </div>
    </div>
  );
}

export default Detail;